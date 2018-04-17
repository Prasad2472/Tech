/**
 * 
 */
package com.core.inner;

/**
 * @author pboini
 *
 */
public class PublicInnerDemo {

	public void helloPublic() {
		System.out.println("helloPublic....");
	}
	
	public class PublicInner{
		public void helloPublicInner() {
			System.out.println("helloPublicInner....");
		}
	}

	public static void main(String[] args) {
		PublicInnerDemo.PublicInner inner=new PublicInnerDemo().new PublicInner();
		inner.helloPublicInner();
	}
}
