package app.service;

import app.Application;
import app.domain.Model;
import app.repository.RepositoryA;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.mockito.Mockito.when;

/**
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(Application.class)
public class ServiceATest {

    @Mock
    RepositoryA repositoryA;

    @InjectMocks
    ServiceAImpl serviceA;


    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void a() {
        when(repositoryA.find()).thenReturn(new Model());

        Model m = serviceA.f();
        Assert.assertNotNull(m);
    }
}
