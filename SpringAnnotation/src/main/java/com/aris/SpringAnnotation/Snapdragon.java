package com.aris.SpringAnnotation;
import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Primary;

@Component
@Primary
public class Snapdragon implements MobileProcessor {
	public void process() {
System.out.println("Best CPU");
}
}