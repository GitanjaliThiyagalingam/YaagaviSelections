import { Component, OnInit } from '@angular/core';
import { HttpClientService, ProductType } from '../service/http-client.service';
import { NavbarService } from '../service/navbar.service';
import { TokenStorageService } from '../auth/token-storage.service';

@Component({
  selector: 'product-type',
  templateUrl: './product-type.component.html',
  styleUrls: ['./product-type.component.css']
})
export class ProductTypeComponent implements OnInit {

  productTypes:ProductType[];
  cards: ProductType[] = [];
  jewels: ProductType[] = [];
  garlands: ProductType[] = [];
  info: any;

  constructor(
    private httpClientService:HttpClientService, public nav:NavbarService, public token: TokenStorageService
  ) { }

  ngOnInit() {
    this.nav.show();
    this.nav.info = {
      token: this.token.getToken(),
      username: this.token.getUsername(),
      authorities: this.token.getAuthorities(),
      email: this.token.getEmail(),
      isButtonVisible: false
    };
    this.httpClientService.getProductTypes().subscribe(
      response =>{
        this.productTypes = response;
        for (let productType of this.productTypes) {
          
          if(productType.type === 'Cards'){
            this.cards.push(productType);
          }
          else if(productType.type === "Jewels"){
            this.jewels.push(productType);
          }
          else if(productType.type === "Garlands"){
            this.garlands.push(productType);
          }
        }
        
      });
      
      }
}