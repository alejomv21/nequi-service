package com.example.Nequi_service.adapter.beanconfigs;

import com.example.Nequi_service.adapter.gateways.h2.FranchiseRegisterGateway;
import com.example.Nequi_service.adapter.presenter.FranchisePresenter;
import com.example.Nequi_service.application.nequiService.boundaries.input.register.IfranchiseRegisterBoundary;
import com.example.Nequi_service.application.nequiService.boundaries.output.register.IfranchiseRegisterGateway;
import com.example.Nequi_service.application.nequiService.interactors.FranchiseInteractor;
import com.example.Nequi_service.application.nequiService.presenter.IfranchisePresenter;
import com.example.Nequi_service.domain.factories.FranchiseFactory;
import com.example.Nequi_service.domain.factories.IfranchiseFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FranchiseConfiguration {
    @Bean
    public IfranchisePresenter franchisePresenter() {
        return new FranchisePresenter();
    }
    @Bean
    public IfranchiseFactory franchiseFactory() {
        return new FranchiseFactory();
    }
    @Bean
    public IfranchiseRegisterGateway franchiseGateway() {
        return new FranchiseRegisterGateway();
    }
    @Bean
    public IfranchiseRegisterBoundary franchiseInputBoundary(IfranchisePresenter commonProductPresenter, IfranchiseFactory commonProductFactory, IfranchiseRegisterGateway commonProductRegisterGateway) {
        return new FranchiseInteractor(commonProductPresenter, commonProductFactory, commonProductRegisterGateway);
    }
}
