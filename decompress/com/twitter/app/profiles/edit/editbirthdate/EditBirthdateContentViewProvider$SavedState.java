// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.app.profiles.edit.editbirthdate;

import java.io.IOException;
import android.os.Parcel;
import android.os.Parcelable$Creator;

@xoe
public class EditBirthdateContentViewProvider$SavedState<OBJ extends EditBirthdateContentViewProvider> extends zp1<OBJ>
{
    public static final Parcelable$Creator CREATOR;
    
    static {
        CREATOR = (Parcelable$Creator)new Parcelable$Creator<EditBirthdateContentViewProvider$SavedState>() {
            public final Object createFromParcel(final Parcel parcel) {
                return new EditBirthdateContentViewProvider$SavedState(parcel);
            }
            
            public final Object[] newArray(final int n) {
                return new EditBirthdateContentViewProvider$SavedState[n];
            }
        };
    }
    
    public EditBirthdateContentViewProvider$SavedState(final Parcel parcel) {
        super(parcel);
    }
    
    public EditBirthdateContentViewProvider$SavedState(final OBJ obj) {
        super((Object)obj);
    }
    
    public OBJ deserializeValue(final vlp vlp, final OBJ obj) throws IOException, ClassNotFoundException {
        final EditBirthdateContentViewProvider editBirthdateContentViewProvider = (EditBirthdateContentViewProvider)super.deserializeValue(vlp, (Object)obj);
        editBirthdateContentViewProvider.X0 = vlp.s();
        editBirthdateContentViewProvider.Y0 = vlp.s();
        return (OBJ)editBirthdateContentViewProvider;
    }
    
    public /* bridge */ Object deserializeValue(final vlp vlp, final Object o) throws IOException, ClassNotFoundException {
        return this.deserializeValue(vlp, (EditBirthdateContentViewProvider)o);
    }
    
    public void serializeValue(final wlp wlp, final OBJ obj) throws IOException {
        super.serializeValue(wlp, (Object)obj);
        wlp.r(obj.X0);
        wlp.r(obj.Y0);
    }
    
    public /* bridge */ void serializeValue(final wlp wlp, final Object o) throws IOException {
        this.serializeValue(wlp, (EditBirthdateContentViewProvider)o);
    }
}
