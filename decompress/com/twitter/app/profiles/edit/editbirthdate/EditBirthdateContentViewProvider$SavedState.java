// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.app.profiles.edit.editbirthdate;

import java.io.IOException;
import android.os.Parcel;
import android.os.Parcelable$Creator;

@lpe
public class EditBirthdateContentViewProvider$SavedState<OBJ extends EditBirthdateContentViewProvider> extends dq1<OBJ>
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
    
    public OBJ deserializeValue(final elp elp, final OBJ obj) throws IOException, ClassNotFoundException {
        final EditBirthdateContentViewProvider editBirthdateContentViewProvider = (EditBirthdateContentViewProvider)super.deserializeValue(elp, (Object)obj);
        editBirthdateContentViewProvider.W0 = elp.u();
        editBirthdateContentViewProvider.X0 = elp.u();
        return (OBJ)editBirthdateContentViewProvider;
    }
    
    public void serializeValue(final flp flp, final OBJ obj) throws IOException {
        super.serializeValue(flp, (Object)obj);
        flp.t(obj.W0);
        flp.t(obj.X0);
    }
}
