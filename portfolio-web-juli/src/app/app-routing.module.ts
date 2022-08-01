import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LoginComponent } from './@Component/login/login.component';
import { PrincipalComponent } from './@Component/principal/principal.component';
import { GuardsGuard } from './servicios/guards.guard';

const routes: Routes = [
{path:'principal', component: PrincipalComponent, canActivate: [GuardsGuard]},
{path: 'iniciar-sesion', component: LoginComponent},
{path: '', redirectTo:'/iniciar-sesion', pathMatch: 'full'},
/*{
 path: 'auth',
 loadChildren () =>
 import(('@modules/auth/auth.module.ts').then(m) => m.AuthModule)
},*/
];


@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
