import requests

def get_holidays(year, country_code):
    """
    Ruft Feiertage für ein bestimmtes Jahr und Land ab.
    """
    url = f"https://feiertage-api.de/api/?jahr={year}&nur_land={country_code}"
    try:
        response = requests.get(url)
        response.raise_for_status()
        holidays = response.json()
        return holidays
    except requests.RequestException as e:
        print(f"Fehler beim Abrufen der Feiertage: {e}")
        return None

def main():
    year = input("Geben Sie das Jahr ein (z.B. 2024): ")
    country_code = input("Geben Sie den Ländercode ein (z.B. BW für Baden Württemberg): ").upper()
    holidays = get_holidays(year, country_code)

    if holidays:
        print(f"\nFeiertage in {country_code} für {year}:")
        for name, details in holidays.items():
            print(f"- {name}: {details['datum']}")
    else:
        print("Keine Feiertage gefunden.")

if __name__ == "__main__":
    main()
