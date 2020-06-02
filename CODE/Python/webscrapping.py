import requests 
from bs4 import BeautifulSoup
resp= requests.get('https://music.naver.com/listen/top100.nhn?domain=TOTAL_V2')
soup = BeautifulSoup(resp.text, 'html.parser')
titles = soup.select('.name') 
title_list=[]
for title in titles:
  title_list.append(title.get_text())
for i in title_list:
  tmp=i.replace("\n",'')
  print(tmp)