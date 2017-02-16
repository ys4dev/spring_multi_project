package app.service;

import app.domain.Model;
import app.repository.RepositoryA;

import javax.inject.Inject;

/**
 *
 */
public class ServiceAImpl implements ServiceA {

    @Inject
    private RepositoryA repositoryA;

    @Override
    public Model f() {
        return repositoryA.find();
    }
}
