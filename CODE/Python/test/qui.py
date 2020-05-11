# -*- coding: utf-8 -*-

# Form implementation generated from reading ui file 'qui.ui'
#
# Created by: PyQt5 UI code generator 5.14.2
#
# WARNING! All changes made in this file will be lost!


from PyQt5 import QtCore, QtGui, QtWidgets


class Ui_Dialog(object):
    def setupUi(self, Dialog):
        Dialog.setObjectName("Dialog")
        Dialog.resize(584, 560)
        self.pushButton = QtWidgets.QPushButton(Dialog)
        self.pushButton.setGeometry(QtCore.QRect(400, 30, 75, 23))
        self.pushButton.setObjectName("pushButton")
        self.doubleSpinBox = QtWidgets.QDoubleSpinBox(Dialog)
        self.doubleSpinBox.setGeometry(QtCore.QRect(400, 100, 62, 22))
        self.doubleSpinBox.setObjectName("doubleSpinBox")
        self.spinBox = QtWidgets.QSpinBox(Dialog)
        self.spinBox.setGeometry(QtCore.QRect(400, 70, 61, 22))
        self.spinBox.setMaximum(10000)
        self.spinBox.setObjectName("spinBox")
        self.lineEdit = QtWidgets.QLineEdit(Dialog)
        self.lineEdit.setGeometry(QtCore.QRect(10, 30, 301, 20))
        self.lineEdit.setObjectName("lineEdit")
        self.pushButton_2 = QtWidgets.QPushButton(Dialog)
        self.pushButton_2.setGeometry(QtCore.QRect(320, 30, 31, 23))
        self.pushButton_2.setObjectName("pushButton_2")
        self.pushButton_3 = QtWidgets.QPushButton(Dialog)
        self.pushButton_3.setGeometry(QtCore.QRect(360, 30, 31, 23))
        self.pushButton_3.setObjectName("pushButton_3")
        self.label = QtWidgets.QLabel(Dialog)
        self.label.setGeometry(QtCore.QRect(470, 80, 56, 12))
        self.label.setObjectName("label")
        self.label_2 = QtWidgets.QLabel(Dialog)
        self.label_2.setGeometry(QtCore.QRect(470, 105, 71, 21))
        self.label_2.setObjectName("label_2")
        self.listWidget = QtWidgets.QListWidget(Dialog)
        self.listWidget.setGeometry(QtCore.QRect(10, 60, 301, 481))
        self.listWidget.setObjectName("listWidget")
        self.pushButton_4 = QtWidgets.QPushButton(Dialog)
        self.pushButton_4.setGeometry(QtCore.QRect(490, 30, 75, 23))
        self.pushButton_4.setObjectName("pushButton_4")

        self.retranslateUi(Dialog)
        QtCore.QMetaObject.connectSlotsByName(Dialog)

    def retranslateUi(self, Dialog):
        _translate = QtCore.QCoreApplication.translate
        Dialog.setWindowTitle(_translate("Dialog", "Dialog"))
        self.pushButton.setText(_translate("Dialog", "시작"))
        self.pushButton_2.setText(_translate("Dialog", "+"))
        self.pushButton_3.setText(_translate("Dialog", "-"))
        self.label.setText(_translate("Dialog", "반복 횟수"))
        self.label_2.setText(_translate("Dialog", "인터벌(초)"))
        self.pushButton_4.setText(_translate("Dialog", "메크로 종료"))


if __name__ == "__main__":
    import sys
    app = QtWidgets.QApplication(sys.argv)
    Dialog = QtWidgets.QDialog()
    ui = Ui_Dialog()
    ui.setupUi(Dialog)
    Dialog.show()
    sys.exit(app.exec_())
