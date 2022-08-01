# This is a sample Python script.# See PyCharm help at https://www.jetbrains.com/help/pycharm/
import pyttsx3
import PyPDF2
from pyttsx3 import Engine

book = open('Diario de Oaxaca by Oliver Sacks.pdf', 'rb')
pdfReader = PyPDF2.PdfFileReader(book)
pages = len(pdfReader.pages)
print(pages)
speaker: Engine = pyttsx3.init()
page = pdfReader._get_page(10)
text = page.extract_text()
speaker.say(text)
speaker.runAndWait()

