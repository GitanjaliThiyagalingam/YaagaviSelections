import { Component, OnInit, Input } from '@angular/core';
import { HttpClientService, Product } from '../service/http-client.service';
import { ActivatedRoute } from '@angular/router';
import { NavbarService } from '../service/navbar.service';
import { TokenStorageService } from '../auth/token-storage.service';

@Component({
  selector: 'products',
  templateUrl: './products.component.html',
  styleUrls: ['./products.component.css']
})
export class ProductsComponent implements OnInit {

  products:Product[];
  id: string;
  private sub: any;

  constructor(
    private httpClientService:HttpClientService, private route: ActivatedRoute, public nav:NavbarService,
    private token: TokenStorageService
  ) { }

  ngOnInit() {
    this.nav.show();
    this.nav.info = {
      token: this.token.getToken(),
      username: this.token.getUsername(),
      authorities: this.token.getAuthorities(),
      isButtonVisible: false
    };
    this.sub = this.route.params.subscribe(params => {
      this.id = params['id'];
    });
    this.httpClientService.getProducts(this.id).subscribe(
      response =>{this.products = response;}
     );
   }

   ngOnDestroy() {
     this.sub.unsubscribe();
   }
 
 }
 