package com.aris.SpringAnnotation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Qualifier;

@Component
public class Samsung {
	@Autowired
	//@Qualifier("Snapdragon")
    MobileProcessor  cpu;
    
	public MobileProcessor getCpu() {
		return cpu;
	}

	public void setCpu(MobileProcessor cpu) {
		this.cpu = cpu;
	}

	public void config() {
		System.out.println("Samsung phone");
		cpu.process();
	}
}
