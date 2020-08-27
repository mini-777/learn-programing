from selenium import webdriver
from selenium.webdriver.common.keys import Keys
from selenium.webdriver.common.action_chains import ActionChains
from PyQt5.QtWidgets import *
import sys, qui
import time
from PyQt5 import QtCore
class ThreadClass(QtCore.QThread):
    que=[]
    dspin=0
    spin=0
    def __init__(self, parent = None): 
        super(ThreadClass,self).__init__(parent)
    def run(self):
        for p in range(self.spin):
            for k in self.que:
                driver = webdriver.Chrome()
                driver.get(k)
                action = ActionChains(driver)
                time.sleep(self.dspin)
                driver.quit()
                

class WindowClass(QMainWindow, qui.Ui_Dialog) :
    def __init__(self, parent = None) :
        self.threadclass = ThreadClass()
        super().__init__()
        self.setupUi(self)
        self.pushButton_4.clicked.connect(self.endFunction)
        self.pushButton.clicked.connect(self.startFunction)
        self.pushButton_2.clicked.connect(self.addItem)
        self.pushButton_3.clicked.connect(self.removeCurrentItem)
    def endFunction(self) :
        sys.exit()
    def addItem(self):
        if not self.lineEdit.text()=="":
            self.listWidget.addItem(self.lineEdit.text())
            self.lineEdit.setText("")
    def startFunction(self) :
        ThreadClass.que = []
        ThreadClass.dspin = self.doubleSpinBox.value()
        ThreadClass.spin = self.spinBox.value()      
        for count in range(self.listWidget.count()):
            ThreadClass.que.append(self.listWidget.item(count).text())
        self.threadclass.start()     
    def removeCurrentItem(self) :
        self.removeItemRow = self.listWidget.currentRow()
        self.listWidget.takeItem(self.removeItemRow)


     
if __name__ == "__main__" :
    app = QApplication(sys.argv) 


    myWindow = WindowClass() 


    myWindow.show()


    app.exec_()
