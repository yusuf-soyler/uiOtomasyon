# uiOtomasyon
pages/
Her sayfaya ait işlemleri ve etkileşimleri barındırır.
Örnek sınıflar:

navigatorPage.java → Ana menü işlemleri

insiderHomePage.java → Anasayfa kontrolleri

careerPage.java → Kariyer sayfası işlemleri

resources/locators/
Her sayfaya özel JSON dosyaları, sayfa elementlerinin locator bilgilerini içerir.
Özellikler:

JSON yapısında id, xpath, css gibi locator’lar tutulur.

Örnek dosyalar:

navigator_page.json

career_page.json

Bu JSON’lar locatorReader sınıfı ile dinamik olarak okunur.

tests/
Tüm test senaryoları burada yer alır. Her test dosyası bir sayfayı hedef alır.
Örnek test sınıfları:

careerTest.java

insiderHomeTest.java

careerOpenPositionsTest.java

utils/
Ortak kullanılan yardımcı sınıflar:

baseTest → Tarayıcı başlatma/kapama işlemleri

driverFactory → Parametrik tarayıcı başlatımı (Chrome, Firefox)

configReader → config.properties dosyasından ayar okuma

generalAssertionHelpers → element_visible_control gibi doğrulamalar

locatorReader → JSON dosyasından locator okuma

screenshotUtil → Hatalı testlerde ekran görüntüsü alma

config.properties
Proje genelindeki sabitler bu dosyadan okunur.
Örnek değişkenler:

base_url

wait_time

user_email

testng.xml
TestNG yapılandırma dosyasıdır.

Test class’ları burada tanımlanır

Global parametreler burada verilir (örn: browser=firefox)

🧩 Kullanılan Önemli Yapılar
Yapı	Amaç
baseTest	Setup/teardown işlemleri, tarayıcıyı aç/kapat
driverFactory	Farklı tarayıcıları başlatma
@Parameters("browser")	TestNG ile dışarıdan tarayıcı parametresi alma
locatorReader	JSON dosyasından locator'ları dinamik çekme
Actions	Hover gibi mouse etkileşimleri
WebDriverWait + ExpectedConditions	Element görünene kadar bekleme
@BeforeMethod / @AfterMethod	Her test öncesi/sonrası çalışacak bloklar
✍️ İsimlendirme Kuralları (Naming Conventions)
Yapı	Format	Örnekler
Class	camelCase	navigatorPage, careerOpenPositionsPage
Değişken	snake_case	element_name, base_url, navigator_locator
Method	snake_case	click_login_button(), verify_home_loaded()
JSON Key	snake_case	"about_us_menu", "get_demo_button"
✅ İlk Task Test Case Atamaları
Aşağıda verilen ilk task kapsamındaki test case’lerin ait oldukları test sınıfları listelenmiştir:

Test Case	Test Class
Case 1	insiderHomeTest
Case 2	careerTest
Case 3-4-5	careerOpenPositionsTest
