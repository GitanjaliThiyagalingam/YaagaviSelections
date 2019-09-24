import { Component, OnInit } from '@angular/core';
import { HttpClientService, Product } from '../service/http-client.service';
import { ActivatedRoute } from '@angular/router';
import { NavbarService } from '../service/navbar.service';
import { TokenStorageService } from '../auth/token-storage.service';

@Component({
  selector: 'product-detail',
  templateUrl: './product-detail.component.html',
  styleUrls: ['./product-detail.component.css']
})
export class ProductDetailComponent implements OnInit {

  product: Product;
  private sub:any;
  id:string;
  constructor(private httpClientService:HttpClientService, private route: ActivatedRoute, 
    public nav:NavbarService, private token: TokenStorageService) { }

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
    this.httpClientService.getProductById(this.id).subscribe(
      response =>{this.product = response;}
     );
  }

  ngOnDestroy() {
    this.sub.unsubscribe();
  }

}
   