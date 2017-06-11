import {BrowserModule} from "@angular/platform-browser";
import {NgModule} from "@angular/core";
import {FormsModule} from "@angular/forms";
import {HttpModule} from "@angular/http";

import {AppComponent} from "./app.component";
import {UserProfilePageComponent} from "./pages/user-profile-page/user-profile-page.component";
import {TeamListPageComponent} from "./pages/team-list-page/team-list-page.component";
import {ContractListPageComponent} from "./pages/contract-list-page/contract-list-page.component";
import {AddressDataListPageComponent} from "./pages/address-data-list-page/address-data-list-page.component";
import {RouterModule} from "@angular/router";
import {appRoutes} from "./app.routes";
import {ContractsService} from "./commons/service/contracts.service";
import {AddressesService} from "./commons/service/addresses.service";
import {PeopleService} from "./commons/service/people.service";
import { ProjectListPageComponent } from './pages/project-list-page/project-list-page.component';
import {ProjectService} from "./commons/service/projects.service";
import {UserService} from "./commons/service/user.service";
import {ProjectTeamListPageComponent} from "./pages/project-team-list-page/project-team-list-page.component";
import {PersonProjectsListPageComponent} from "./pages/person-projects-list-page/person-projects-list-page.component";
import {JobTitleFilter} from "./pages/pipes/job-title-filter";
import {NameFilter} from "./pages/pipes/name-filter";
import {BottomNumberLimitFilter} from "./pages/pipes/bottom-number-limit-filter";
import {TopNumberLimitFilter} from "./pages/pipes/top-number-limit-filter";
import {CityFilter} from "./pages/pipes/city-filter";

@NgModule({
  declarations: [
    AppComponent,
    UserProfilePageComponent,
    TeamListPageComponent,
    ContractListPageComponent,
    AddressDataListPageComponent,
    ProjectListPageComponent,
    ProjectTeamListPageComponent,
    PersonProjectsListPageComponent,
    JobTitleFilter,
    NameFilter,
    BottomNumberLimitFilter,
    TopNumberLimitFilter,
    CityFilter
  ],
  imports: [
    RouterModule.forRoot(appRoutes),
    BrowserModule,
    FormsModule,
    HttpModule
  ],
  providers: [
    ContractsService,
    AddressesService,
    PeopleService,
    ProjectService,
    UserService
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
