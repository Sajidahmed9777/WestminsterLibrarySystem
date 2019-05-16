import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AddDVDComponent } from './add-dvd.component';

describe('AddDVDComponent', () => {
  let component: AddDVDComponent;
  let fixture: ComponentFixture<AddDVDComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AddDVDComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AddDVDComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
