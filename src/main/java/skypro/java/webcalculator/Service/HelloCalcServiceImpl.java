package skypro.java.webcalculator.Service;

import org.springframework.stereotype.Service;

@Service
public class HelloCalcServiceImpl implements HelloCalcService{
    @Override
    public String hello() {
        return "Добро пожаловать в калькулятор!";
    }
}
