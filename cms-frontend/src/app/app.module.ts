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

@NgModule({
  declarations: [
    AppComponent,
    UserProfilePageComponent,
    TeamListPageComponent,
    ContractListPageComponent,
    AddressDataListPageComponent
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
    PeopleService
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
