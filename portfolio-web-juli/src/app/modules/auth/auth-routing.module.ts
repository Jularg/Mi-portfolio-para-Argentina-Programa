import { NgModule } from "@angular/core";
import { RouterModule, Routes } from "@angular/router";
import { LoginComponent } from "src/app/@Component/login/login.component";
import { PrincipalComponent } from "src/app/@Component/principal/principal.component";

const routes: Routes =[ 
    {path: 'portfolio', component: PrincipalComponent},
    {path: 'login', component: LoginComponent},
    {path: '', redirectTo:'login', pathMatch:  'full' }
];
@NgModule ({
    imports:[RouterModule.forChild(routes)],
    exports: [RouterModule]
})

export class AuthRoutingModule { }