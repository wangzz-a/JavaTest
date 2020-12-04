package designPatterns.abstractFactoryPattern;

/**
 * 蓝色
 * @author wangzz
 * @date 2020年12月03日 16:48
 */

public class Blue implements Color {
	@Override
	public void fill() {
		System.out.println("Inside Blue::fill() method.");
	}
}
