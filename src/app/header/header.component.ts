import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css'],
})
export class HeaderComponent implements OnInit {

  constructor(private router:Router) { }

  ngOnInit() {
  }
searchResult(search:NgForm)
{
  let txt:String=search.value.searchField;
  console.log(txt);
  if(txt==="angular")
  {
  this.router.navigate(['/SearchResult'])
  }
  else{
    this.router.navigate(['']);
  }
}


}
