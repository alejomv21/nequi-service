package com.example.Nequi_service.adapter.beanconfigs;
import com.example.Nequi_service.adapter.gateways.h2.ProductRegisterGetaway;
import com.example.Nequi_service.adapter.presenter.ProductPresenter;
import com.example.Nequi_service.application.nequiService.boundaries.input.register.IfranchiseRegisterBoundary;
import com.example.Nequi_service.application.nequiService.boundaries.input.register.IproductRegisterBoundary;
import com.example.Nequi_service.application.nequiService.boundaries.output.register.IfranchiseRegisterGateway;
import com.example.Nequi_service.application.nequiService.boundaries.output.register.IproductRegisterGetaway;
import com.example.Nequi_service.application.nequiService.interactors.FranchiseInteractor;
import com.example.Nequi_service.application.nequiService.interactors.ProductInteractor;
import com.example.Nequi_service.application.nequiService.presenter.IProductPresenter;
import com.example.Nequi_service.application.nequiService.presenter.IfranchisePresenter;
import com.example.Nequi_service.domain.factories.IfranchiseFactory;
import com.example.Nequi_service.domain.factories.IproductFactory;
import com.example.Nequi_service.domain.factories.ProductFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProductConfiguration {
    @Bean
    public IProductPresenter productPresenter() {
        return new ProductPresenter();
    }
    @Bean
    public IproductFactory productFactory() {
        return new ProductFactory();
    }
    @Bean
    public IproductRegisterGetaway  productGateway() {
        return new ProductRegisterGetaway();
    }

    @Bean
    public IproductRegisterBoundary productInputBoundary(IProductPresenter productPresenter, IproductFactory productFactory, IproductRegisterGetaway productRegisterGateway) {
        return new ProductInteractor(productPresenter, productFactory, productRegisterGateway);
    }
}
