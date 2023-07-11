import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { LoginComponent } from './login/login.component';
import { SignUpComponent } from './sign-up/sign-up.component';
import { OrderComponent } from './order/order.component';
import { ReciptComponent } from './recipt/recipt.component';
import { MenuComponent } from './menu/menu.component';
import { HomeComponent } from './home/home.component';
import { NavbarComponent } from './navbar/navbar.component';



@NgModule({
  declarations: [
    LoginComponent,
    SignUpComponent,
    OrderComponent,
    ReciptComponent,
    MenuComponent,
    HomeComponent,
    NavbarComponent
  ],
  imports: [
    CommonModule
  ]
})
export class CMSModuleModule { }
