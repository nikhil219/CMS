import { Injectable } from '@angular/core';
import {HttpClient}  from '@angular/common/http'
import { map } from 'rxjs';
@Injectable({
    providedIn:'root'
})
export class HeroService {
    constructor(private http:HttpClient){

    }
    public restApi(){
        // this.http.get<Config>(this.configUrl);
        // return this.http.get('https://localhost:8080/api',{observe:'response'}).pipe(map(response=>response));
        return this.http.get('https://localhost:8080/api');
    }
 
}