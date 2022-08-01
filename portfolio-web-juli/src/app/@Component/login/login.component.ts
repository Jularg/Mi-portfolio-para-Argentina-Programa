import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validator, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { AuthService } from 'src/app/modules/auth/auth.service';
import { AutenticacionService } from 'src/app/servicios/autenticacion.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.scss']
})

  

/*export class LoginComponent implements OnInit {
 email= '';
 password= '';
 constructor(private authService: AuthService) { }
   Login () {
     this.authService.login(this.email, this.password)
     
   }*/
/* aca meter los datos segun el JSON del login de la API...> aun no constuida)*/
 export class LoginComponent implements OnInit {
  form: FormGroup;
  constructor(private formBuilder: FormBuilder,private autenticacionService:AutenticacionService, private ruta:Router ) {
    
    this.form=this.formBuilder.group( {
       email: ['', [Validators.required, Validators.email ]],
       password: ['', [Validators.required, Validators.minLength(8)]],
//agregar el resto de las cosas del JSON: token y demas 
      
    }
   )
  }
    ngOnInit():void  {} 
  //propiedades para acceder a form controls 
    get Email() {
      return this.form.get('email');
    }

    get Password() {
      return this.form.get('password');
    }

    onEnviar(event:Event)
    {
      event.preventDefault;
      this.autenticacionService.IniciarSesion(this.form.value).subscribe(data=> {
        console.log("DATA:" +JSON.stringify(data));
        this.ruta.navigate(['/principal'])
      })
    }
     
  }
 
  
  



