import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import java.util.Set;

import static org.junit.Assert.assertEquals;

//@RunWith(SpringRunner.class)
//@SpringBootTest
public class TestApplication {

    private static Validator validator;

    @BeforeClass
    public static void setUp(){
        validator =  Validation.buildDefaultValidatorFactory().getValidator();
    }

    @Test
    public void demo1(){
        Demo demo = new Demo("123", "DD-AB-123", 4 );
        Set<ConstraintViolation<Demo>> constraintViolations =
                validator.validate(demo);
//        assertEquals( 1, constraintViolations.size() );
//        assertEquals(
//                "may not be null",
//                constraintViolations.iterator().next().getMessage()
//        );
    }
    @Test
    public void licensePlateTooShort() {
        Demo car = new Demo( "Morris", "D", 4 );

        Set<ConstraintViolation<Demo>> constraintViolations =
                validator.validate( car );

        assertEquals( 1, constraintViolations.size() );
        assertEquals(
                "size must be between 2 and 14",
                constraintViolations.iterator().next().getMessage()
        );
    }
    @Test
    public void seatCountTooLow() {
        Demo car = new Demo( "", "DD-AB-123", 1 );

        Set<ConstraintViolation<Demo>> constraintViolations = validator.validate(car);

        if(constraintViolations.size()!=0){
            System.out.println("size:"+constraintViolations.size());
            constraintViolations.iterator().forEachRemaining(p->{
//                System.out.println(p.getConstraintDescriptor()+"--"+p.getMessage());
//                System.out.println(p.getExecutableParameters()+"--"+p.getMessage());
//                System.out.println(p.getExecutableReturnValue()+"--"+p.getMessage());
//                System.out.println(p.getInvalidValue()+"--"+p.getMessage());
//                System.out.println(p.getLeafBean()+"--"+p.getMessage());
//                System.out.println(p.getMessageTemplate()+"--"+p.getMessage());
                System.out.println(p.getPropertyPath()+"--"+p.getMessage());
//                System.out.println(p.getRootBean()+"--"+p.getMessage());
            });
//            System.out.println(constraintViolations.iterator().next().getMessage());
        }
//        assertEquals( 1, constraintViolations.size() );
//        assertEquals(
//                "must be greater than or equal to 2",
//                constraintViolations.iterator().next().getMessage()
//        );
    }

    @Test
    public void carIsValid() {
        Demo car = new Demo( "Morris", "DD-AB-123", 2 );

        Set<ConstraintViolation<Demo>> constraintViolations =
                validator.validate( car );

        assertEquals( 0, constraintViolations.size() );
    }
}
