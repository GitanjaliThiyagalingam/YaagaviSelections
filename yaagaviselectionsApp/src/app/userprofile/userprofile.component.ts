import { Component, OnInit } from '@angular/core';
import { NavbarService } from '../service/navbar.service';
import { TokenStorageService } from '../auth/token-storage.service';
import { Router } from '@angular/router';

@Component({
  selector: 'userprofile',
  templateUrl: './userprofile.component.html',
  styleUrls: ['./userprofile.component.css']
})
export class UserprofileComponent implements OnInit {

  info: any;
  isLoggedIn = false;
  roles: string[] = [];

  constructor(
    public nav:NavbarService, public token: TokenStorageService, private router: Router
  ) { }

  ngOnInit() {
    this.nav.show();
    if (this.token.getToken()) {
      this.isLoggedIn = true;
      this.roles = this.token.getAuthorities();
    }
    if (!this.isLoggedIn) {
      this.router.navigate(['']);
    }
    this.nav.info = {
      token: this.token.getToken(),
      username: this.token.getUsername(),
      authorities: this.token.getAuthorities(),
      email: this.token.getEmail(),
      isButtonVisible: false
    };

    
      
      }
}