package step00_과제3;
/*
 * [문제33]다중클래스를 만들고 setter & getter를 이용하여 다음을 완성하시오
(1)클래스명:  BookShop
    -bname:String   (책이름)
    -author:String   (저자) 
    -price:int          (가격) 
    +setBook(bname:String,  auth  or:String, price:int):void
    +viewBook():void
    +setter & getter

(2)조건
    1) Test33클래스의 main()메서드에서 BookShop 클래스로 객체 ob를 만든다
    2) setBook("자바완성","황완성",25000)로 값을 대입한후 viewBook()메서드로 출력한다
    3) setBname("JSP잡기"),  setAuthor("송JP"), setPrice(3500)로 값을 대입한후
         getBname(), getAuthor(), getPrice()로 출력한다

[출력화면]
책이름 : 자바완성
저  자 : 황완성
가  격 : 25000원

책이름 : JSP잡기
저  자 : 송JP
가  격 : 35000원
 */
class Bookshop {

	private String bname;
	private String author;
	private int price;
	public Bookshop() {
		// TODO Auto-generated constructor stub
	}
		public Bookshop(String bname, String author, int price) {
		super();
		this.bname = bname;
		this.author = author;
		this.price = price;
	}
			
	public String getBname() {
			return bname;
		}
		public void setBname(String bname) {
			this.bname = bname;
		}
		public String getAuthor() {
			return author;
		}
		public void setAuthor(String author) {
			this.author = author;
		}
		public int getPrice() {
			return price;
		}
		public void setPrice(int price) {
			this.price = price;
		}
		
	public void setBook(String bname, String author, int price) {
		bname=n;
		author=a;
		price=p;
	}
		
		
	public void viewBook() {
		System.out.println("책이름 : "+getBname()+"\n"
				+ "저  자 : "+getAuthor()+"\n"
				+ "가  격 : "+getPrice());
	}
	
	
	public static void main(String[] args) {
		Bookshop bk=new Bookshop();
	    bk.setBook("자바완성", "황완성", 25000);
	    
	    bk.viewBook();
	}

}
