import { Component } from '@angular/core';
import {HeroService} from './cms-api-service.service'

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  constructor(private cms:HeroService){

  }
  title = 'CMS';
  restcalled(){
    this.cms.restApi().subscribe((data) =>{
      console.log(data)
  })

  }
}
