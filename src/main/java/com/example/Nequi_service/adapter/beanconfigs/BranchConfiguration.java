package com.example.Nequi_service.adapter.beanconfigs;

import com.example.Nequi_service.adapter.gateways.h2.BranchRegisterGateway;
import com.example.Nequi_service.adapter.presenter.BranchPresenter;
import com.example.Nequi_service.application.nequiService.boundaries.input.register.IbranchRegisterBoundary;
import com.example.Nequi_service.application.nequiService.boundaries.output.register.IbranchRegisterGetaway;
import com.example.Nequi_service.application.nequiService.interactors.BranchInteractor;
import com.example.Nequi_service.application.nequiService.presenter.IbrachPresenter;
import com.example.Nequi_service.domain.factories.BranchFactory;
import com.example.Nequi_service.domain.factories.IbranchFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BranchConfiguration {
    @Bean
    public IbrachPresenter branchPresenter() {
        return new BranchPresenter();
    }
    @Bean
    public IbranchFactory branchFactory() {
        return new BranchFactory();
    }
    @Bean
    public IbranchRegisterGetaway branchRegisterGateway() {
        return new BranchRegisterGateway();
    }
    @Bean
    public IbranchRegisterBoundary branchInputBoundary(IbrachPresenter branchPresenter, IbranchFactory branchFactory, IbranchRegisterGetaway branchRegisterGateway) {
        return new BranchInteractor(branchPresenter, branchFactory, branchRegisterGateway);
    }
}
