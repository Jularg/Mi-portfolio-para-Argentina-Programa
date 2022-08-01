import { Component, OnInit } from '@angular/core';
import { PortfolioService } from 'src/app/servicios/portfolio.service';

@Component({
  selector: 'app-estudio',
  templateUrl: './estudio.component.html',
  styleUrls: ['./estudio.component.scss']
})
export class EstudioComponent implements OnInit {
 estudioList:any;
  constructor(private datosPortfolio: PortfolioService) { }

  ngOnInit(): void {
 this.datosPortfolio.obtenerDatos().subscribe(data=>{
  console.log("Datos Estudio" +JSON.stringify(data));
  this.estudioList=[]; //que chota pongo aca? 

 } );

  }

}
