import { Injectable } from '@angular/core';
import { TokenStorageService } from '../auth/token-storage.service';

@Injectable({
  providedIn: 'root'
})
export class NavbarService {
  visible: boolean;
  info: any;

  constructor() { 
    this.visible = true; 
  }

  hide() { this.visible = false; }

  show() { this.visible = true; }

  toggle() { this.visible = !this.visible; }

}