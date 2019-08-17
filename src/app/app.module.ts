import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { LoginComponent } from './login/login.component';
import { LearnerSignupComponent } from './learner-signup/learner-signup.component';
import { RouterModule } from '@angular/router';
import { MentorSignupComponent } from './mentor-signup/mentor-signup.component';
import { HomePageComponent } from './home-page/home-page.component';
import { SearchResultsComponent } from './search-results/search-results.component';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    LoginComponent,
    LearnerSignupComponent,
    MentorSignupComponent,
    HomePageComponent,
    SearchResultsComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    RouterModule.forRoot([
      { path: 'Header', component: HeaderComponent },
      { path: 'LearnerSignUp', component: LearnerSignupComponent },
      { path: 'MentorSignUp', component: MentorSignupComponent },
      { path: 'SearchResult', component: SearchResultsComponent }
    ]
    )

  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
