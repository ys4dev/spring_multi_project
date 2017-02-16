package app.repository1;

import app.domain.Model;
import org.springframework.stereotype.Component;

/**
 *
 */
@Component
public class RepositoryImpl implements RepositoryA {
    @Override
    public Model find() {
        Model model = new Model("named");
        return model;
    }
}
