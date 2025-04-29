//
//  ContentView.swift
//  schemeDemo
//
//  Created by henry on 2025/1/9.
//

import SwiftUI
import UIKit

struct ContentView: View {
    var body: some View {
        VStack {
            Image(systemName: "globe")
                .imageScale(.large)
                .foregroundStyle(.tint)
            Button(action: {
                        let url = URL(string: "linkpay://newage.com/cashier?merchant_order_no=1122223&order_amount=1&notify_url=app://payment.com/result")!
                       // if UIApplication.shared.canOpenURL(url) {
                            UIApplication.shared.open(url, options: [:], completionHandler: nil)
                      //  } else {
                    //        print("无法打开URL")
                     //   }
                
                        }) {
                            Text("スキャン")
                                .padding()
                                .background(Color.blue)
                                .foregroundColor(.white)
                                .cornerRadius(8)
                        }
        }
        .padding()
    }
}

#Preview {
    ContentView()
}
