from selenium import webdriver
from selenium.webdriver.common.keys import Keys
from selenium.webdriver.common.action_chains import ActionChains
import sys
from PyQt5.QtWidgets import *
from PyQt5 import uic
import time
form_class = uic.loadUiType("untitled.ui")[0]


class WindowClass(QMainWindow, form_class) :
    def __init__(self) :
        super().__init__()
        self.setupUi(self)
        self.pushButton.clicked.connect(self.startFunction)
        self.pushButton_2.clicked.connect(self.addItem)
        self.pushButton_3.clicked.connect(self.removeCurrentItem)
    def addItem(self):
        if not self.lineEdit_3.text()=="":
            self.listWidget.addItem(self.lineEdit_3.text())
            self.lineEdit_3.setText("")
    def startFunction(self) :
        for count in range(self.listWidget.count()):
            arr=[]
            arr.append(self.listWidget.item(count).text())
        for _ in range(self.spinBox_2.value()):
            for url in arr:
                time.sleep(self.doubleSpinBox.value())
                driver = webdriver.Chrome()
                driver.get(url)
                action = ActionChains(driver)
                driver.close()
    def removeCurrentItem(self) :
       
        self.removeItemRow = self.listWidget.currentRow()
        self.listWidget.takeItem(self.removeItemRow)


        
if __name__ == "__main__" :

    app = QApplication(sys.argv) 


    myWindow = WindowClass() 


    myWindow.show()


    app.exec_()
