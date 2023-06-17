import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ReciptComponent } from './recipt.component';

describe('ReciptComponent', () => {
  let component: ReciptComponent;
  let fixture: ComponentFixture<ReciptComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ReciptComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ReciptComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
