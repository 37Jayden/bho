/**
 * Copyright (C) 2011 Whisper Systems
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.thoughtcrime.securesms;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.RelativeLayout;
import android.widget.TextView;
import org.ironrabbit.tbtxt.R;

/**
 * List item view for displaying user identity keys.
 *
 * @author Moxie Marlinspike
 */
public class IdentityKeyView extends RelativeLayout {

  private TextView identityName;
  private String   identityKeyString;

  public IdentityKeyView(Context context) {
    super(context);

    LayoutInflater li = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    li.inflate(R.layout.identity_key_view, this, true);

    initializeResources();
  }

  public IdentityKeyView(Context context, AttributeSet attributeSet) {
    super(context, attributeSet);
  }

  public void set(String name, String identityKeyString) {
    identityName.setText(name);
    this.identityKeyString = identityKeyString;
  }

  public String getIdentityKeyString() {
    return this.identityKeyString;
  }

  private void initializeResources() {
    this.identityName = (TextView)findViewById(R.id.identity_name);
  }

}
