# uiOtomasyon
 pages/
 Her sayfaya ait işlemleri barındırır. Örneğin:
•	navigatorPage.java → Ana menü işlemleri
•	insiderHomePage.java → Anasayfa kontrolleri
•	careerPage.java → Kariyer sayfası işlemleri


🔹 resources/locators/
Her sayfa için ayrı .json dosyaları:
•	JSON yapısında locator’lar tutulur (örn: id, xpath, css)
•	Örnek: navigator_page.json, career_page.json
Locator’lar locatorReader sınıfıyla dinamik şekilde okunur.

🔹 tests/
Her sayfanın test senaryoları burada ayrı ayrı tanımlanır.
•	careerTest.java
•	insiderHomeTest.java
•	careerOpenPositionsTest.java

🔹 utils/
Ortak kullanılan sınıflar burada tutulur:
•	baseTest → Tarayıcıyı başlatır, kapatır.
•	driverFactory → Parametrik browser başlatır (Chrome, Firefox)
•	configReader → config.properties üzerinden base_url gibi ayarları okur.
•	generalAssertionHelpers → element_visible_control gibi doğrulama fonksiyonları
•	locatorReader → JSON’dan locator alma işlemi
•	screenshotUtil → Hatalı testlerde ekran görüntüsü alma
🔹 config.properties
•	Proje içi sabitleri buradan okursun (örnek: base_url, wait_time, user_email)

🔹 testng.xml
•	Test class’larını tanımlar
•	Tüm testler için geçerli olacak parametreleri burada ayarlarsın (örn: browser=firefox)

________________________________________

Kullanılan Önemli Yapılar

Yapı	Amaç
baseTest	Ortak setup/teardown yapısı, tarayıcıyı aç/kapat
driverFactory	Parametrik tarayıcı seçimi
@Parameters("browser")	TestNG ile dışarıdan parametre alma
locatorReader	Sayfaya özel JSON’dan locator’ı dinamik çekme
Actions	Hover gibi mouse etkileşimleri
WebDriverWait + ExpectedConditions	Element görünene kadar bekleme
@BeforeMethod / @AfterMethod	Her test öncesi/sonrası çalışan bloklar

İsimlendirme Kuralları (Naming Convention)
Yapı	Format	Örnek
Class İsimleri

	camelCase	navigatorPage, careerOpenPositionsPage


Değişkenler	snake_case	element_name, base_url, navigator_locator


Methodlar	snake_case	click_login_button(), verify_home_loaded()


JSON Anahtarları

	snake_case	"about_us_menu", "get_demo_button"




Bana verilen 1. Taskın içindeki caseleri, şu class’ların içinde görüntüleyebilirsiniz.
Test Case

	Class Adı


Case 1
insiderHomeTest
Case 2	careerTest
Case 3-4-5	careerOpenPositionsTest

