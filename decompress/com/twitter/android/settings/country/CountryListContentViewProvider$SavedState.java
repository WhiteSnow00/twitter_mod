// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.android.settings.country;

import java.io.IOException;
import android.os.Parcel;
import android.os.Parcelable$Creator;

@xoe
public class CountryListContentViewProvider$SavedState<OBJ extends CountryListContentViewProvider> extends zp1<OBJ>
{
    public static final Parcelable$Creator CREATOR;
    
    static {
        CREATOR = (Parcelable$Creator)new Parcelable$Creator<CountryListContentViewProvider$SavedState>() {
            public final Object createFromParcel(final Parcel parcel) {
                return new CountryListContentViewProvider$SavedState(parcel);
            }
            
            public final Object[] newArray(final int n) {
                return new CountryListContentViewProvider$SavedState[n];
            }
        };
    }
    
    public CountryListContentViewProvider$SavedState(final Parcel parcel) {
        super(parcel);
    }
    
    public CountryListContentViewProvider$SavedState(final OBJ obj) {
        super((Object)obj);
    }
    
    public OBJ deserializeValue(final vlp vlp, final OBJ obj) throws IOException, ClassNotFoundException {
        final CountryListContentViewProvider countryListContentViewProvider = (CountryListContentViewProvider)super.deserializeValue(vlp, (Object)obj);
        vlp.s();
        countryListContentViewProvider.X0 = (wy6)((y4j)wy6.F0).a(vlp);
        return (OBJ)countryListContentViewProvider;
    }
    
    public /* bridge */ Object deserializeValue(final vlp vlp, final Object o) throws IOException, ClassNotFoundException {
        return this.deserializeValue(vlp, (CountryListContentViewProvider)o);
    }
    
    public void serializeValue(final wlp wlp, final OBJ obj) throws IOException {
        super.serializeValue(wlp, (Object)obj);
        wlp.r(true);
        ((y4j)wy6.F0).c(wlp, (Object)obj.X0);
        final int a = c5j.a;
    }
    
    public /* bridge */ void serializeValue(final wlp wlp, final Object o) throws IOException {
        this.serializeValue(wlp, (CountryListContentViewProvider)o);
    }
}
