import { Component, OnInit } from '@angular/core';
import { HttpClientService, Product, ProductType } from './service/http-client.service';
import { TokenStorageService } from './auth/token-storage.service';


@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'Yaagavi Selections';
  productTypes:ProductType[];
  private roles: string[];
  private authority: string;
  info: any;

  constructor(
    private httpClientService:HttpClientService, public tokenStorage: TokenStorageService
  ) { }

  ngOnInit() {
    this.httpClientService.getProductTypes().subscribe(
      response =>{this.productTypes = response;}
     );
     this.info = {
      token: this.tokenStorage.getToken(),
      username: this.tokenStorage.getUsername(),
      authorities: this.tokenStorage.getAuthorities(),
      isButtonVisible: false
    };
   }
}

