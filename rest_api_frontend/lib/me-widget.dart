import 'package:flutter/material.dart';

import 'me-model.dart';

class MeWidget extends StatelessWidget {
  final Me me;

  MeWidget({this.me});

  @override
  Widget build(BuildContext context) {
    return Container(
        padding: EdgeInsets.all(2),
        height: 140,
        child: Card(
          elevation: 5,
          child: Row(
              mainAxisAlignment: MainAxisAlignment.spaceEvenly,
              children: <Widget>[
                Container(
                  padding: EdgeInsets.all(5),
                  child: Column(
                    mainAxisAlignment: MainAxisAlignment.spaceEvenly,
                    children: <Widget>[
                      Text(this.me.name,
                          style: TextStyle(fontWeight: FontWeight.bold)),
                      Text("firstName:${this.me.firstName}"),
                      Text("website:${this.me.website}"),
                    ],
                  ),
                ),
              ]),
        ));
  }
}
