import json
import os
from fitparse import FitFile

# Prompt user to enter the path to the FIT file
folder_path = input("Please enter the folder path to the folder_path: ")

print(f"Getting folder_path {folder_path}")

# Check if the folder_path exists
if not os.path.exists(folder_path):
    print(f"Error: The folder_path {folder_path} does not exist.")
else:
    print("folder_path exists.")
        
    # Loop through all files in the folder
    for filename in os.listdir(folder_path):
        # Check if the file has a .fit extension
        print(f"Got filename: {filename}")
        
        # if filename.endswith('.fit'):
        if filename.endswith('.fit'):
            fitfile_path = os.path.join(folder_path, filename)
            print(f"Processing file: {fitfile_path}")

            try:     
                # Load the FIT file
                fitfile = FitFile(fitfile_path)
                
                # List to hold parsed data
                fit_data = []
                print(f"Got fitfile: {fitfile}")

                for message in fitfile.get_messages():
                    print(f"message: {message}")
                    
                for workout in fitfile.get_messages('workout'):
                    print(f"workout: {workout}")
                    
                # Extract "record" data
                for workout_step in fitfile.get_messages('workout_step'):
                    # print(f"Getting workout_step {workout_step}")
                    record_data = {}
                    
                    # Loop through each field in the "record" message
                    for record_field in workout_step:
                        record_data[record_field.name] = record_field.value
                    # print(f"Getting workout_step {record_field}")
                    
                    fit_data.append(record_data)
                    print(f"Compiling fit_data: {fit_data}")
                    newFileName = filename.strip('.fit')

                # Save the parsed data to a JSON file
                with open(f"{folder_path}/{newFileName}.json", 'w') as json_file:
                    json.dump(fit_data, json_file, indent=4)                    
                
                
                # Convert parsed data to JSON
                json_filename = f"{os.path.splitext(newFileName)[0]}.json"
                json_filepath = os.path.join(folder_path, json_filename)
                
                print(f"File converted to JSON: {json_filepath}")
        
            except Exception as e:
                print(f"Error processing {fitfile_path}: {e}")
        else:
            print(f"filename {filename} is not a fit file")

