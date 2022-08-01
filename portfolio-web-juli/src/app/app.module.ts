import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { NavbarComponent } from './@Component/navbar/navbar.component';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';

import { PrincipalComponent } from './@Component/principal/principal.component';
import { FormBuilder, ReactiveFormsModule } from '@angular/forms';
import { HttpClient, HttpClientModule, HTTP_INTERCEPTORS } from '@angular/common/http';
import { AcercaComponent } from './@Component/acerca/acerca.component';
import { BotonRrssComponent } from './@Component/boton-rrss/boton-rrss.component';
import { CopyrightComponent } from './@Component/copyright/copyright.component';

import { EstudioComponent } from './@Component/estudio/estudio.component';
import { ExperienciaComponent } from './@Component/experiencia/experiencia.component';
import { FooterComponent } from './@Component/footer/footer.component';
import { HeaderComponent } from './@Component/header/header.component';
import { LoginComponent } from './@Component/login/login.component';
import { SkillComponent } from './@Component/skill/skill.component';
import { PortfolioService } from './servicios/portfolio.service';
import { InterceptorService } from './servicios/interceptor.service';




@NgModule({
  declarations: [
    AppComponent,
   
    NavbarComponent,
    HeaderComponent,
    LoginComponent,
    ExperienciaComponent, 
    AcercaComponent,
    EstudioComponent,
    SkillComponent,
     //que onda Modulo o Component?
    
    FooterComponent,
    BotonRrssComponent,
    CopyrightComponent,
    PrincipalComponent, 
    
    
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    ReactiveFormsModule,
    HttpClientModule,
    
   
  ],
  providers: [ PortfolioService,
  {provide: HTTP_INTERCEPTORS, useClass:InterceptorService, multi: true } ],
  bootstrap: [AppComponent]
})
export class AppModule { }
