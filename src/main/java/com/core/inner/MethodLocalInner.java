/**
 * 
 */
package com.core.inner;

/**
 * @author pboini
 *
 */
public class MethodLocalInner {

	
	public void methodLocalInner() {
		class MethodLocal{
		
			public void callMethodLocal() {
				System.out.println("Hello/....callMethodLocal");
			}
		}
		final MethodLocal local=new MethodLocal();
		local.callMethodLocal();
	}
	
	public static void main(final String[] args) {
		final MethodLocalInner inner=new MethodLocalInner();
		inner.methodLocalInner();
	}
}
