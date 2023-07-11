import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LoginComponent } from './cmsmodule/login/login.component';
import { HomeComponent } from './cmsmodule/home/home.component';
import { OrderComponent } from './cmsmodule/order/order.component';
import { MenuComponent } from './cmsmodule/menu/menu.component';
import { NavbarComponent } from './cmsmodule/navbar/navbar.component';
import { HttpClientModule } from '@angular/common/http';
@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    HomeComponent,
    OrderComponent,
    MenuComponent,
    NavbarComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    AppRoutingModule,
    
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
