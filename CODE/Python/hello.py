import openpyxl

wb=openpyxl.load_workbook('test.xlsx')
sheet = wb.active

sheet['B2'] = 'b3'
wb.save('test.xlsx')