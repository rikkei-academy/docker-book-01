import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import {environment} from '../environments/environment';
@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent {
  title = 'webapp';
  api:string = 'api';

  constructor(private http: HttpClient) {
  }

  check() {
    console.log('api',environment.API);
    this.http.get(environment.API + '/api/helloworld').subscribe({
      next: (data) => {
        console.log(data);
      }
    });
  }
}
