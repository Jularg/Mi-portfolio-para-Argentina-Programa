import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { BehaviorSubject} from 'rxjs';
import { Observable } from 'rxjs';
import { map } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class AutenticacionService {
  url= "insertar la url de la api de authenticacion api/auth/login";
  currentUserSubject: BehaviorSubject<any>;
   

  constructor(private http:HttpClient ) { 
    console.log("El servicio de autenticación está corriendo");
    this.currentUserSubject= new BehaviorSubject<any>(JSON.parse(sessionStorage.getItem('currentUser')||'{}')); //todo eso biene del back cuando hacemos el session 
  }

  IniciarSesion(credenciales:any):Observable<any>
  {
  return this.http.post(this.url, credenciales).pipe(map(data=>{
    //storage: objeto de almacenamiento local, SIN ir a la BD 
    sessionStorage.setItem('currentUser', JSON.stringify(data));
    this.currentUserSubject.next(data);
    return data;
  } ))
  }

  get UsuarioAutenticado ()
  {
    return this.currentUserSubject.value;
  }

}
