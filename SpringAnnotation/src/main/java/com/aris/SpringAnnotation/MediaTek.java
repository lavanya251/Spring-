package com.aris.SpringAnnotation;
import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Primary;

@Component
//@Primary
public class MediaTek implements MobileProcessor {
public void process() {
	System.out.println("2nd BEST CPU");
}
}
