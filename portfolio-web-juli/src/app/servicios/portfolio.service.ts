import { HttpClient, HttpClientModule } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})

export class PortfolioService {
 url:string= "url de la api";
  constructor( private http:HttpClient) { }

  obtenerDatos():Observable<any> {
    /*console.log("El servicio funciona") para testear*/
    /*Lo mejor aca es meter una url de donde obtener los datos por ejemplo clever*/     
    return this.http.get(`${this.url}persona`);
  }
}
