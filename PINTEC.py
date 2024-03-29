from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC
import os 
from webdriver_manager.chrome import ChromeDriverManager
from selenium.webdriver.chrome.service import Service 



servico = Service(ChromeDriverManager().install())


navegador = webdriver.Chrome(service=servico)

#fazendo a requisição da url
navegador.get('https://www.ibge.gov.br/estatisticas/multidominio/ciencia-tecnologia-e-inovacao/9141-pesquisa-de-inovacao.html?=&t=downloads')
#obtendo os caminhos xml(xpath)
navegador.find_element('xpath','//*[@id="Industrias_Extrativas_e_de_Transformacao/Pesquisa_de_Inovacao_Tecnologica/2017"]/i').click()
navegador.find_element('xpath','/html/body/main/section/div[2]/div/div/section/div[8]/div/div[1]/ul/li/ul/li[7]/ul/li[2]/div').click()
navegador.implicitly_wait(1)
navegador.find_element('xpath','//*[@id="j1_39_anchor"]').click()

# Criar o diretório na área de trabalho
#diretorio_desktop = os.path.expanduser("~\Desktop")
#diretorio_pintec = os.path.join(diretorio_desktop, "PINTE")
#os.mkdir(diretorio_pintec)

# Verificando se o arquivo foi baixado
diretorio_downloads = os.path.expanduser("~/Downloads")
arquivo = os.path.join(diretorio_downloads, "pintec2017_cnae_20201221 (4).xls")
while not os.path.exists(arquivo):
    pass
    
# Movendo o arquivo para o diretório PINTEC
arquivo_destino = os.path.join(diretorio_pintec, "pintec2017_cnae_20201221 (4).xls")
os.rename(arquivo, arquivo_destino)

import os

def renomear_arquivo(nome_antigo, nome_novo):
    contador = 0
    nome_novo_completo = nome_novo
    while os.path.exists(nome_novo_completo):
        contador += 1
        nome_novo_completo = f"{nome_novo} ({contador})"
    
    os.rename(nome_antigo, nome_novo_completo)

# Renomear arquivo
renomear_arquivo("arquivo_antigo.txt", "arquivo_novo.txt")


