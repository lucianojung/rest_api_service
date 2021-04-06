class Me {
  final String name;
  final String firstName;
  final String email;
  final String website;

  Me(
      this.name,
      this.firstName,
      this.email,
      this.website,
      );

  factory Me.fromJSON(Map<String, dynamic> json) {
    return Me(json['name'], json['firstName'], json['email'], json['website']);
  }
}